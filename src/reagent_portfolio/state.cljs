(ns reagent-portfolio.state
  (:require
   [reagent.core :as r]))

(def showcase (r/atom {:showcase-1 {:id :showcase-1
                                    :name "Shipment"
                                    :abstract "A file hosting web application"
                                    :image "static/shipment-card.png"
                                    :tags ["React" "TypeScript" "Tailwind CSS" "Firebase"]
                                    :link "https://decompiler-shipment.web.app"
                                    :source "https://github.com/The-Decompiler/shipment"}
                       :showcase-2 {:id :showcase-2
                                    :name "Ultraviolet"
                                    :abstract "Remotely control your computer with a mobile app"
                                    :image "static/ultraviolet-card.png"
                                    :tags ["React Native" "TypeScript" "Go" "Network"]
                                    :link ""
                                    :source "https://github.com/The-Decompiler/ultraviolet"}
                       :showcase-3 {:id :showcase-3
                                    :name "Neurage"
                                    :abstract "Take a picture and see what age you look like"
                                    :image "static/neurage-card.png"
                                    :tags ["React" "TypeScript" "Styled Components" "Python" "FastAPI"]
                                    :link "https://neurage.netlify.app"
                                    :source "https://github.com/The-Decompiler/neurage"}
                       :showcase-4 {:id :showcase-4
                                    :name "Link Shrink"
                                    :abstract "A simple URL shortener"
                                    :image "static/link-shrink-card.png"
                                    :tags ["React" "TypeScript" "Node" "MongoDB" "Tailwind CSS" "Formik"]
                                    :link "https://link-shrink.netlify.app/"
                                    :source "https://github.com/maxminoS/link-shrink"}
                       :showcase-5 {:id :showcase-5
                                    :name "Quote Box"
                                    :abstract "Displays random quotes from an API"
                                    :image "static/quote-box-card.png"
                                    :tags ["React" "TypeScript" "Jest" "Cypress" "React Testing" "Material UI"]
                                    :link "https://the-quote-box.netlify.app"
                                    :source "https://github.com/maxminoS/quote-box"}
                       :showcase-6 {:id :showcase-6
                                    :name "Pure Searchbar"
                                    :abstract "Searchbar for countries and cities"
                                    :image "static/pure-searchbar-card.png"
                                    :tags ["HTML" "CSS" "JavaScript"]
                                    :link "https://pure-searchbar.netlify.app"
                                    :source "https://github.com/maxminoS/pure-searchbar"}}))

(def projects (r/atom {:project-01 {:id :project-01
                                    :name "dotfiles"
                                    :abstract "The dotfiles that compile just about everything I need in a machine"
                                    :category ["Emacs" "Shell"]
                                    :tags ["Emacs Lisp" "Shell" "GNU Stow"]
                                    :link ""
                                    :source "https://github.com/maxminoS/.dotfiles"}
                       :project-02 {:id :project-02
                                    :name "Shipment"
                                    :abstract "A file hosting web application"
                                    :category ["Web"]
                                    :tags ["React" "TypeScript" "Tailwind CSS" "Firebase"]
                                    :link "https://decompiler-shipment.web.app"
                                    :source "https://github.com/The-Decompiler/shipment"}
                       :project-03 {:id :project-03
                                    :name "Ultraviolet"
                                    :abstract "Remotely control your computer with a mobile app"
                                    :category ["Mobile"]
                                    :tags ["React Native" "TypeScript" "Go" "Network"]
                                    :link ""
                                    :source "https://github.com/The-Decompiler/ultraviolet"}
                       :project-04 {:id :project-04
                                    :name "Neurage"
                                    :abstract "Take a picture and see what age you look like"
                                    :category ["Web" "Machine Learning"]
                                    :tags ["React" "TypeScript" "Styled Components" "Python" "TensorFlow" "FastAPI"]
                                    :link "https://neurage.netlify.app"
                                    :source "https://github.com/The-Decompiler/neurage"}
                       :project-05 {:id :project-05
                                    :name "Link Shrink"
                                    :abstract "A simple URL shortener"
                                    :category ["Web"]
                                    :tags ["React" "TypeScript" "Node" "MongoDB" "Tailwind CSS" "Formik"]
                                    :link "https://link-shrink.netlify.app/"
                                    :source "https://github.com/maxminoS/link-shrink"}
                       :project-06 {:id :project-06
                                    :name "Quote Box"
                                    :abstract "Displays random quotes from an API"
                                    :category ["Web"]
                                    :tags ["React" "TypeScript" "Jest" "Cypress" "React Testing Library" "Material UI"]
                                    :link "https://the-quote-box.netlify.app"
                                    :source "https://github.com/maxminoS/quote-box"}
                       :project-07 {:id :project-07
                                    :name "Pure Searchbar"
                                    :abstract "Searchbar for countries and cities"
                                    :category ["Web"]
                                    :tags ["HTML" "CSS" "JavaScript"]
                                    :link "https://pure-searchbar.netlify.app"
                                    :source "https://github.com/maxminoS/pure-searchbar"}
                       :project-08 {:id :project-08
                                    :name "Watchalong"
                                    :abstract "A media synchronization project for mpv"
                                    :category ["Network"]
                                    :tags ["Go" "Lua" "mpv"]
                                    :link ""
                                    :source "https://github.com/The-Decompiler/watchalong"}
                       :project-09 {:id :project-09
                                    :name "Fizzboxd"
                                    :abstract "A Leterboxd film feed RSS reader Discord bot"
                                    :category ["Bot"]
                                    :tags ["Go" "SQLite"]
                                    :link ""
                                    :source "https://github.com/The-Decompiler/fizzboxd"}
                       :project-10 {:id :project-10
                                    :name "Samaritan"
                                    :abstract "Uploads all attachments in a Discord channel to Google Drive"
                                    :category ["Bot"]
                                    :tags ["Python" "Google API"]
                                    :link ""
                                    :source "https://github.com/maxminoS/samaritan"}
                       :project-11 {:id :project-11
                                    :name "Pure Microprojects"
                                    :abstract "A variety of responsive micro web projects built purely using HTML, CSS, and vanilla JavaScript"
                                    :category ["Web"]
                                    :tags ["HTML" "CSS" "JavaScript"]
                                    :link "https://pure-projects.netlify.app"
                                    :source "https://github.com/maxminoS/pure-js"}
                       :project-12 {:id :project-12
                                    :name "Flask Generator"
                                    :abstract "A script to generate a Flask website template"
                                    :category ["Web" "Template"]
                                    :tags ["Python" "Flask" "Bootstrap" "SQLite" "Authentication"]
                                    :link ""
                                    :source "https://github.com/maxminoS/flask-gen"}
                       :project-13 {:id :project-13
                                    :name "Markup Parser"
                                    :abstract "Parses markup text and previews it"
                                    :category ["Web"]
                                    :tags ["React" "TypeScript" "Material UI" "Org Mode"]
                                    :link "https://markup-parser.netlify.app"
                                    :source "https://github.com/maxminoS/markup-parser"}
                       :project-14 {:id :project-14
                                    :name "Oolong"
                                    :abstract "A simple shell script to rename all the files in the directory to include their lengths"
                                    :category ["Shell"]
                                    :tags ["Bash" "ffmpeg"]
                                    :link ""
                                    :source "https://github.com/maxminoS/oolong"}
                       :project-15 {:id :project-15
                                    :name "HTTP Server"
                                    :abstract "A simple HTTP server from scratch"
                                    :category ["Network"]
                                    :tags ["Python" "HTTP"]
                                    :link ""
                                    :source "https://github.com/maxminoS/http-server"}
                       :project-16 {:id :project-16
                                    :name "desktop-environment"
                                    :abstract "Control Linux desktop from Emacs"
                                    :category ["Contributions" "Emacs"]
                                    :tags ["Emacs Lisp"]
                                    :link ""
                                    :source "https://github.com/DamienCassou/desktop-environment/pull/21"}
                       :project-17 {:id :project-17
                                    :name "all-the-icons.el"
                                    :abstract "Collect Icon Fonts for use within Emacs"
                                    :category ["Contributions" "Emacs"]
                                    :tags ["Emacs Lisp"]
                                    :link ""
                                    :source "https://github.com/domtronn/all-the-icons.el/pull/240"}}))
