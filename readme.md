Katanakana! (カタナカナ!)
---------------------------------------------------------------------------------------------------------------------------
Katanakana is an Android application built using the **[Phonegap Mobile Framework](http://www.phonegap.com/)** that
aims to teach people one of the Japanese alphabets, Katakana. Katakana is often noted to be one of the more useful
languages to have some sense of if you're visiting Japan, as it's largely used on menus and for words that aren't
of Japanese origin.

It aims to teach through a somewhat algorithmic approach; what this basically entails is a simple formula that watches
for how often a character is incorrectly identified by the user, and will adjust its "resurfacing" time based on the average
amount of seconds it seems to take a person to commit a character to short term memory. This app is built to try and use
short term memory as a jumping off point; **[for more information on the approach used here, consult the initial release article](http://venodesigns.net/2011/03/06/hacking-the-human-brain/)**.

Something to note is that this application was built over the course of roughly 3 hours; it's an initial first shot/attempt
that may or may not be 100% beneficial to people, but with refinement could be quite interesting. Katanakana is released under 
an MIT license in the hopes that others might find the approach interesting, and further extend it to the benefit of any party
interested in learning Japanese.


The Version of Katanakana in the Android Market...
---------------------------------------------------------------------------------------------------------------------------
The version of this application is listed on the Android Market, and priced at 99 cents USD. The original author keeps it on
there for the hell of it, but anyone is free to repurpose this and upload it to the market for themselves, just give proper
attribution as the MIT license specifies. :)

**[Katanakana on the Android Market](https://market.android.com/details?id=com.phonegap.Katanakana)**


Questions, Comments?
---------------------------------------------------------------------------------------------------------------------------
Email: **ryan [at] venodesigns _dot_ net**  
Twitter: **[@ryanmcgrath](http://twitter.com/ryanmcgrath)**   
Web: **[Veno Designs](http://venodesigns.net/)**  


Requirements for Compiling
-------------------------------------------
**[Android Development Environment](http://developer.android.com/sdk/index.html)**  
**[Ant, if you're using a Terminal]()**  
**[Eclipse, if you're a Java-head who uses IDEs](http://www.eclipse.org/)**  


Compiling This Yourself (Eclipse)
-------------------------------------------
Eclipse has an Android plugin to facilitate this. I don't use it because
Eclipse and IDEs just get in my way (what this basically means is that I don't even
know where to begin with this). Documentation should be abound, though, as it's an official
Google supported method for Android development.

If you work with this enough, feel free to submit a pull request for this section of the README,
other Eclipse users would surely appreciate it!


Compiling This Yourself (Terminal)
-------------------------------------------
To compile/run on a phone/device in debug mode, run (in the root directory):

    ant -v debug install

To compile/store a signed version, **[generate an application keystore](http://developer.android.com/guide/publishing/app-signing.html)** and run:

    ant release

It should ask you for a keystore password/etc; if you did the generation step, you should know them. ;)
