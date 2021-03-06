# lukeyoffe-Hotkey_Settings
Thanks for checking out my project!
To try it out on your (Windows) computer, you will need to do the following:
 - Have java installed (if typing "java" into the command prompt/powershell gives you a usage message, it's installed)
 - Have AutoHotkey installed in "Program Files" such that the path to AutoHotkey.exe 
   is "C:\Program Files\AutoHotkey\AutoHotkey.exe" (if you haven't installed AutoHotkey, download it at https://www.autohotkey.com/)
 - Clone this repository
 - Open command prompt or powershell, and navigate to the the "src" folder of this repository (from the root directory, type ```cd src```)
 - Compile the java files with: ```javac *.java```
 - Execute Main.java with: ```java Main```
 - This should open up the graphical user interface

Some things to know about setting up hotkeys:
 - A hotstring is a string of characters, that when typed, will be autocorrected to another string
   - Ex. to set up the hotstring "ty" to autocorrect to "thank you", set the keys to be "t" and "y" (don't type quotes)
     and the argument to be "thank you"
 - A hotkey that opens a website/file/application will open that file/website/application using the default application
   to do so (in the case of websites and files) when you press the specified keys
   - For websites, be sure to enter the entire url, which often has "https://" at the beginning
   - For applications, the most sure-fire way to get the desired app to open is to right click it's shortcut
     (can probably be found in "C:\ProgramData\Microsoft\Windows\Start Menu\Programs" or one of its subdirectories),
     right click the shortcut, and copy the text in the "target" field to the argument of your hotkey
