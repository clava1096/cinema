(function(){"use strict";var t={4559:function(t,n,r){var o=r(9242),e=r(3396);const c=(0,e._)("div",{id:"app"},null,-1);function u(t,n,r,o,u,i){const a=(0,e.up)("product_card");return(0,e.wg)(),(0,e.iD)(e.HY,null,[c,(0,e.Wm)(a)],64)}var i=r(7139);const a={class:"product-card"},d=["src"],p={class:"product-card__name"},s={class:"product-card__description"};function f(t,n,r,o,c,u){return(0,e.wg)(),(0,e.iD)("div",a,[(0,e._)("img",{src:c.product.imageUrl,alt:"product.name",class:"product-card__image"},null,8,d),(0,e._)("h3",p,(0,i.zw)(c.product.name),1),(0,e._)("p",s,(0,i.zw)(c.product.description),1)])}var l=r(1076),v={data(){return{product:[]}},mounted(){l.Z.get("http://localhost:8081/products").then((t=>{this.product=t.data,console.log(this.product.name),console.log(t.data)})).catch((t=>{console.error(t)}))}},h=r(89);const g=(0,h.Z)(v,[["render",f],["__scopeId","data-v-7d792eaa"]]);var _=g,m={name:"App",components:{product_card:_}};const b=(0,h.Z)(m,[["render",u]]);var y=b;(0,o.ri)(y).mount("#app")}},n={};function r(o){var e=n[o];if(void 0!==e)return e.exports;var c=n[o]={exports:{}};return t[o].call(c.exports,c,c.exports,r),c.exports}r.m=t,function(){var t=[];r.O=function(n,o,e,c){if(!o){var u=1/0;for(p=0;p<t.length;p++){o=t[p][0],e=t[p][1],c=t[p][2];for(var i=!0,a=0;a<o.length;a++)(!1&c||u>=c)&&Object.keys(r.O).every((function(t){return r.O[t](o[a])}))?o.splice(a--,1):(i=!1,c<u&&(u=c));if(i){t.splice(p--,1);var d=e();void 0!==d&&(n=d)}}return n}c=c||0;for(var p=t.length;p>0&&t[p-1][2]>c;p--)t[p]=t[p-1];t[p]=[o,e,c]}}(),function(){r.n=function(t){var n=t&&t.__esModule?function(){return t["default"]}:function(){return t};return r.d(n,{a:n}),n}}(),function(){r.d=function(t,n){for(var o in n)r.o(n,o)&&!r.o(t,o)&&Object.defineProperty(t,o,{enumerable:!0,get:n[o]})}}(),function(){r.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(t){if("object"===typeof window)return window}}()}(),function(){r.o=function(t,n){return Object.prototype.hasOwnProperty.call(t,n)}}(),function(){r.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})}}(),function(){var t={143:0};r.O.j=function(n){return 0===t[n]};var n=function(n,o){var e,c,u=o[0],i=o[1],a=o[2],d=0;if(u.some((function(n){return 0!==t[n]}))){for(e in i)r.o(i,e)&&(r.m[e]=i[e]);if(a)var p=a(r)}for(n&&n(o);d<u.length;d++)c=u[d],r.o(t,c)&&t[c]&&t[c][0](),t[c]=0;return r.O(p)},o=self["webpackChunktest_app"]=self["webpackChunktest_app"]||[];o.forEach(n.bind(null,0)),o.push=n.bind(null,o.push.bind(o))}();var o=r.O(void 0,[998],(function(){return r(4559)}));o=r.O(o)})();
//# sourceMappingURL=app.4b87c5c0.js.map