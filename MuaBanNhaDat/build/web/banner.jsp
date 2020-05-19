
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Banner</title>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <meta name="viewport" content="width=device-width,height=device-height,user-scalable=yes, initial-scale=1, minimum-scale=1.0, maximum-scale=3.0" >
        <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
        <style>
            .slides {
                margin-top: 100px;
            }
            
.slides-nav {
  z-index: 99;

  position: fixed;
  right: -5%;
  display: -webkit-box;
  display: flex;
  -webkit-box-align: center;
          align-items: center;
  height: 100%;
  color: #111;
}
@media (min-width: 54em) {
  .slides-nav {
    right: 2%;
  }
}
.slides-nav__nav {
  position: relative;
  right: 0;
  display: block;
  font-size: 1em;
  -webkit-transform: rotate(90deg);
          transform: rotate(90deg);
  -webkit-transform-origin: center;
          transform-origin: center;
}
.slides-nav button {
  position: relative;
  display: inline-block;
  padding: 0.35em;
  margin: 0;
  font-family: "Space Mono", monospace;
  -webkit-appearance: none;
     -moz-appearance: none;
          appearance: none;
  background: transparent;
  border: 0;
  overflow-x: hidden;
  -webkit-transition: color 0.5s ease;
  transition: color 0.5s ease;
}
.slides-nav button:after {
  content: '';
  position: absolute;
  top: 50%;
  left: 0;
  height: 1px;
  width: 0;
  background: #111;
  -webkit-transition: width 0.4s ease;
  transition: width 0.4s ease;
}
.slides-nav button:hover {
  cursor: pointer;
  color: rgba(17, 17, 17, 0.75);
  -webkit-transition: color 0.5s ease;
  transition: color 0.5s ease;
}
.slides-nav button:hover:after {
  width: 100%;
  -webkit-transition: width 0.4s ease;
  transition: width 0.4s ease;
}
.slides-nav button:focus {
  outline: 0;
}
.is-sliding .slides-nav {
  pointer-events: none;
}

.slides {
  position: relative;
  display: block;
  height: 100vh;
  width: 100%;
  background: #fff;
  -webkit-transition: background 1s cubic-bezier(0.99, 1, 0.92, 1);
  transition: background 1s cubic-bezier(0.99, 1, 0.92, 1);
}
.is-sliding .slides {
  background: #ededed;
  -webkit-transition: background 0.3s cubic-bezier(0.99, 1, 0.92, 1);
  transition: background 0.3s cubic-bezier(0.99, 1, 0.92, 1);
}

.slide {
  z-index: -1;
  padding: 0;
  position: absolute;
  width: 100%;
  height: 100vh;
  -webkit-transition: z-index 1s ease;
  transition: z-index 1s ease;
}
.slide.is-active {
  z-index: 19;
  -webkit-transition: z-index 1s ease;
  transition: z-index 1s ease;
}
.slide__content {
  position: relative;
  margin: 0 auto;
  height: 95%;
  width: 95%;
  top: 2.5%;
}
@media (min-width: 54em) {
  .slide__content {
    height: 80%;
    width: 80%;
    top: 10%;
  }
}
.slide__header {
  z-index: 9;
  position: relative;
  height: 100%;
  display: -webkit-box;
  display: flex;
  -webkit-box-align: center;
          align-items: center;
  overflow-y: hidden;
  -webkit-transform: translateX(5%);
          transform: translateX(5%);
}
@media (min-width: 54em) {
  .slide__header {
    -webkit-transform: translateX(-5%);
            transform: translateX(-5%);
  }
}
.slide__title {
  font-family: Montserrat, helvetica;
  font-size: 2.5em;
  font-weight: 700;
  color: #111;
  overflow-y: hidden;
}
@media (min-width: 54em) {
  .slide__title {
    font-size: 5em;
  }
}
.slide__title .title-line {
  display: block;
  overflow-y: hidden;
}
.slide__title .title-line span {
  display: inline-block;
  -webkit-transform: translate3d(0, 140%, 0);
          transform: translate3d(0, 140%, 0);
  opacity: 0;
  -webkit-transition: opacity 0.8s ease, -webkit-transform 0.4s ease;
  transition: opacity 0.8s ease, -webkit-transform 0.4s ease;
  transition: transform 0.4s ease, opacity 0.8s ease;
  transition: transform 0.4s ease, opacity 0.8s ease, -webkit-transform 0.4s ease;
}
.slide__title .title-line span:nth-child(1) {
  -webkit-transition-delay: 0.15s;
          transition-delay: 0.15s;
}
.slide__title .title-line span:nth-child(2) {
  -webkit-transition-delay: 0.3s;
          transition-delay: 0.3s;
}
.is-active .slide__title .title-line span {
  -webkit-transform: translate3d(0, 0%, 0);
          transform: translate3d(0, 0%, 0);
  opacity: 1;
  -webkit-transition: opacity 0.1s ease, -webkit-transform 0.6s cubic-bezier(0.77, 0, 0.175, 1);
  transition: opacity 0.1s ease, -webkit-transform 0.6s cubic-bezier(0.77, 0, 0.175, 1);
  transition: transform 0.6s cubic-bezier(0.77, 0, 0.175, 1), opacity 0.1s ease;
  transition: transform 0.6s cubic-bezier(0.77, 0, 0.175, 1), opacity 0.1s ease, -webkit-transform 0.6s cubic-bezier(0.77, 0, 0.175, 1);
}
.is-active .slide__title .title-line:nth-of-type(2n) span {
  -webkit-transition-delay: 0.2s;
          transition-delay: 0.2s;
}
.slide__figure {
  z-index: 7;
  position: absolute;
  left: 0;
  right: 0;
  margin: 0 auto;
  height: 100%;
  width: 100%;
  -webkit-transition: -webkit-transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
  transition: -webkit-transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
  transition: transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
  transition: transform 0.5s cubic-bezier(0.19, 1, 0.22, 1), -webkit-transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
}
.is-sliding .slide__figure {
  -webkit-transform: scale(0.8);
          transform: scale(0.8);
  -webkit-transition: -webkit-transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
  transition: -webkit-transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
  transition: transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
  transition: transform 0.5s cubic-bezier(0.19, 1, 0.22, 1), -webkit-transform 0.5s cubic-bezier(0.19, 1, 0.22, 1);
}
.slide__img {
  position: relative;
  display: block;
  background-size: cover;
  background-attachment: fixed;
  background-position: 50%;
  -webkit-backface-visibility: hidden;
  height: 0%;
  width: 100%;
  -webkit-filter: grayscale(0%);
          filter: grayscale(0%);
  -webkit-transition: height 1s 1.4s cubic-bezier(0.19, 1, 0.22, 1), -webkit-filter 0.4s 0.1s ease;
  transition: height 1s 1.4s cubic-bezier(0.19, 1, 0.22, 1), -webkit-filter 0.4s 0.1s ease;
  transition: height 1s 1.4s cubic-bezier(0.19, 1, 0.22, 1), filter 0.4s 0.1s ease;
  transition: height 1s 1.4s cubic-bezier(0.19, 1, 0.22, 1), filter 0.4s 0.1s ease, -webkit-filter 0.4s 0.1s ease;
}
.is-active .slide__img {
  height: 100%;
  opacity: 1;
  -webkit-transition: height 0.5s 0.3s cubic-bezier(0.77, 0, 0.175, 1), -webkit-filter 0.4s 0.1s ease;
  transition: height 0.5s 0.3s cubic-bezier(0.77, 0, 0.175, 1), -webkit-filter 0.4s 0.1s ease;
  transition: height 0.5s 0.3s cubic-bezier(0.77, 0, 0.175, 1), filter 0.4s 0.1s ease;
  transition: height 0.5s 0.3s cubic-bezier(0.77, 0, 0.175, 1), filter 0.4s 0.1s ease, -webkit-filter 0.4s 0.1s ease;
}
.is-sliding .slide__img {
  -webkit-filter: grayscale(100%);
          filter: grayscale(100%);
}
        </style>
<!--        <script>
          (function($) {
 
  var SliceSlider = {
    
    /**
     * Settings Object
     */
    settings: {
      delta:              0,
      currentSlideIndex:  0,
      scrollThreshold:    40,
      slides:             $('.slide'),
      numSlides:          $('.slide').length,
      navPrev:            $('.js-prev'),
      navNext:            $('.js-next'),
    },
    
    /**
     * Init
     */
    init: function() {
      s = this.settings;
      this.bindEvents();
    },
    
    /**
     * Bind our click, scroll, key events
     */
    bindEvents: function(){
      
      // Scrollwheel & trackpad
      s.slides.on({
        'DOMMouseScroll mousewheel' : SliceSlider.handleScroll
      });
      // On click prev
      s.navPrev.on({
        'click' : SliceSlider.prevSlide
      });
      // On click next
      s.navNext.on({
        'click' : SliceSlider.nextSlide
      });
      // On Arrow keys
      $(document).keyup(function(e) {
        // Left or back arrows
        if ((e.which === 37) ||  (e.which === 38)){
          SliceSlider.prevSlide();
        }
        // Down or right
        if ((e.which === 39) ||  (e.which === 40)) {
          SliceSlider.nextSlide();
        }
      });
    },
    
    /** 
     * Interept scroll direction
     */
    handleScroll: function(e){

      // Scrolling up
      if (e.originalEvent.detail < 0 || e.originalEvent.wheelDelta > 0) { 

        s.delta--;
     
        if ( Math.abs(s.delta) >= s.scrollThreshold) {
          SliceSlider.prevSlide();
        }
      }
 
      // Scrolling Down
      else {
 
        s.delta++;
 
        if (s.delta >= s.scrollThreshold) {
          SliceSlider.nextSlide();
        }
      }
 
      // Prevent page from scrolling
      return false;
    },

    /**
     * Show Slide
     */
    showSlide: function(){ 
      // reset
      s.delta = 0;
      // Bail if we're already sliding
      if ($('body').hasClass('is-sliding')){
        return;
      }
      // Loop through our slides
      s.slides.each(function(i, slide) {

        // Toggle the is-active class to show slide
        $(slide).toggleClass('is-active', (i === s.currentSlideIndex)); 
        $(slide).toggleClass('is-prev', (i === s.currentSlideIndex - 1)); 
        $(slide).toggleClass('is-next', (i === s.currentSlideIndex + 1)); 
        
        // Add and remove is-sliding class
        $('body').addClass('is-sliding');

        setTimeout(function(){
            $('body').removeClass('is-sliding');
        }, 1000);
      });
    },

    /**
     * Previous Slide
     */
    prevSlide: function(){
      
      // If on first slide, loop to last
      if (s.currentSlideIndex <= 0) {
        s.currentSlideIndex = s.numSlides;
      }
      s.currentSlideIndex--;
      
      SliceSlider.showSlide();
    },

    /**
     * Next Slide
     */
    nextSlide: function(){
      
      s.currentSlideIndex++;
   
      // If on last slide, loop to first
      if (s.currentSlideIndex >= s.numSlides) { 
        s.currentSlideIndex = 0;
      }
 
      SliceSlider.showSlide();
    },
  };
  SliceSlider.init();
})(jQuery);
        </script>-->

    </head>
    <body >
    
                <main>
<section class="slides"> 
  
  <section class="slides-nav">
<!--    <nav class="slides-nav__nav">
      <button class="slides-nav__prev js-prev">Prev</button>
      <button class="slides-nav__next js-next">Next</button>
    </nav>-->
  </section>

  <section class="slide is-active">
    <div class="slide__content">
      <figure class="slide__figure"><div class="slide__img" style="background-image: url(https://images.unsplash.com/photo-1493934558415-9d19f0b2b4d2?ixlib=rb-1.2.1&auto=format&fit=crop&w=1036&q=80)"></div></figure>
      <header class="slide__header">
        <h2 class="slide__title">
          <span class="title-line"><span>Click, Key</span></span>
          <span class="title-line"><span>Or Scroll Fool</span></span>
        </h2>
      </header>
    </div>
  </section>

<!--  <section class="slide">
    <div class="slide__content">
      <figure class="slide__figure"><div class="slide__img" style="background-image: url(https://source.unsplash.com/okmtVMuBzkQ/2000x1100)"></div></figure>
      <header class="slide__header">
        <h2 class="slide__title">
          <span class="title-line"><span>Slide Two</span></span>
          <span class="title-line"><span>Dood Mood</span></span>
        </h2>
      </header>
    </div>
  </section>

  <section class="slide">
    <div class="slide__content">
      <figure class="slide__figure"><div class="slide__img" style="background-image: url(https://source.unsplash.com/WuQME0I_oZA/2000x1100)"></div></figure>
      <header class="slide__header">
        <h2 class="slide__title">
          <span class="title-line"><span>This Right</span></span>
          <span class="title-line"><span>Here Makes Three</span></span>
        </h2>
      </header>
    </div>
  </section>-->

  <section class="slide">
    <div class="slide__content">
      <figure class="slide__figure"><div class="slide__img" style="background-image: url(https://source.unsplash.com/NsWcRlBT_74/2000x1100)"></div></figure>
      <header class="slide__header">
        <h2 class="slide__title">
          <span class="title-line"><span>How Now</span></span>
          <span class="title-line"><span>Part Four More</span></span>
        </h2>
      </header>
    </div>
  </section>
</section>
</main>
    
    </body>
</html>
