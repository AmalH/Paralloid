## Paralloid Library for Android ##

This is a copy of the Parraloid library by chrisjenx:

Features

Parallax another view when the parent scrolls.
Parallax multiple backgrounds.
Transformers, Parallax in different ways and directions

Supports:

ListView
ScrollView
HorizontalScrollView
Modular

Paralloid is designed to be modular and very loosely coupled (to an extent).

Two high level modules exist

paralloid - which is the library which everything extends from.
paralloidviews - which extends the library with a couple of pre-extended ScrollableViews.
paralloidexamples - which is of course the examples App.
Generally use paralloidviews as it contains everything you need to get going.

Getting Started

Dependency:

dependencies {
    compile 'com.github.AmalLibs:Paralloid:1.0.0'
}


USE :

<FrameLayout
		android:id="@+id/top_content"
           	android:layout_width="match_parent"
           	android:layout_height="192dp"/>

<com.tn.amalhichri.library.views.ParallaxScrollView>
        android:id="@+id/scroll_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:fillViewport="true">

    <LinearLayout
    	android:id="@+id/scroll_content"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingTop="192dp"/>

</com.tn.amalhichri.library.views.ParallaxScrollView>
</FrameLayout>
