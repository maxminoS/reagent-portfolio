(ns ^:figwheel-hooks reagent-portfolio.core
  (:require
   [reagent-portfolio.state :as state]
   [reagent.dom :as d]))

(defn nav-bar []
  [:ul
   [:li [:a {:href "#home"} "Home"]]
   [:li [:a {:href "#blog" :style {:pointer-events "none" :color "red"}} "Blog"]] ; disabled
   [:li [:a {:href "#projects"} "Projects"]]
   [:li [:a {:href "#contact"} "Contact"]]])

(defn tag-item [tag]
  [:span.tag tag])

(defn showcase-card [{:keys [name abstract image tags link source]}]
  [:div.card
   [:div.card-overlay
    [:div.card-caption
     [:h3 name]
     [:h5 abstract]
     [:div.tag-block
      (for [tag tags]
        ^{:key tag}
        [tag-item tag])]
     [:a.icon-link {:href link :target "_blank"} [:i.fa.fa-globe]]
     [:a.icon-link {:href source :target "_blank"} [:i.fa.fa-github]]]
    [:div.overlay]]
   [:div.card-image
    [:img {:src image
           :alt name}]]])

(defn showcase []
  [:div
   [:h2 "Projects"]
   [:div.card-block
    (for [{:keys [id name abstract image tags link source]} (vals @state/showcase)]
      [showcase-card {:key id
                      :name name
                      :abstract abstract
                      :image image
                      :tags tags
                      :link link
                      :source source}])]
   [:button.more-button "View more"]])

(defn home-page []
  [:div
   [nav-bar]
   [showcase]])

(defn mount []
  (d/render [home-page] (.getElementById js/document "root")))

(defn ^:after-load re-render []
  (mount))

(defn ^:before-load unmount []
  (d/unmount-component-at-node (.getElementById js/document "root")))

(mount)

 ;; Showcase: https://mattfarley.ca/ (view more)
 ;; Projects: github/repos_list

 ;; README: https://github.com/rcaferati/rcaferati
