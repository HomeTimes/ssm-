
const path = require("path")
const htmlwebpackplugin=require("html-webpack-plugin")
const VueLoaderPlugin =require('vue-loader/lib/plugin')
module.exports = {
	mode:'production',
	entry:path.join(__dirname,"./src/main.js"),
	output:{
		path:path.join(__dirname,"./dist"),
        filename:"bundle.js"
	},
	plugins:[
	   new htmlwebpackplugin({
		   template:path.join(__dirname,"./src/index.html"),
		   filename:"index.html"
	   }),
	   new VueLoaderPlugin()
	],
	module:{
		rules:[
			{
				test:/\.css$/,use:["style-loader","css-loader"]
			},
			{
				test:/\.less$/,use:["style-loader","css-loader","less-loader"]
			},
			{ 
				test:/\.scss$/,use:["style-loader","css-loader","sass-loader"]
			},

		{
			test:/\.vue$/,use:"vue-loader"
		},
		{
			test: /\.(png|jpg|gif|eot|woff|ttf|svg|webp|PNG)(\?\S*)?$/,
			use: ["file-loader"],
		  },
		]
	}

}