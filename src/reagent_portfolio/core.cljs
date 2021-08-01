(ns ^:figwheel-hooks reagent-portfolio.core
  (:require
   [reagent-portfolio.state :as state]
   [reagent.dom :as d]))

(defn header []
  [:div.header
   [:div.title
    [:img {:src "static/logo.svg"}]
    [:h1 "Projects"]]
   [:img.header-image {:src "static/header.svg"}]])

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
     [:div.icons
      (when (seq link)
        [:a.icon-link {:href link :target "_blank"} [:i.fa.fa-globe]])
      (when (seq source)
        [:a.icon-link {:href source :target "_blank"} [:i.fa.fa-github]])]]
    [:div.overlay]]
   [:div.card-image
    [:img {:src image
           :alt name}]]])

(defn showcase []
  [:div
   [:div.card-block
    (for [{:keys [id name abstract image tags link source]} (vals @state/showcase)]
      [showcase-card {:key id
                      :name name
                      :abstract abstract
                      :image image
                      :tags tags
                      :link link
                      :source source}])]
   [:div.button-block
    [:a.view-more {:href "https://github.com/maxminoS?tab=repositories"}
     "View More"]]])

(defn home-page []
  [:div
   [header]
   [showcase]])

(defn mount []
  (d/render [home-page] (.getElementById js/document "root")))

(defn ^:after-load re-render []
  (mount))

(defn ^:before-load unmount []
  (d/unmount-component-at-node (.getElementById js/document "root")))

(mount)
