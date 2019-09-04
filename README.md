Installing emacs setup for java
1. Install eclipse stuff
   - curl http://ftp.jaist.ac.jp/pub/eclipse/technology/epp/downloads/release/2019-03/R/eclipse-java-2019-03-R-linux-gtk-x86_64.tar.gz -O
   - sudo tar -zxvf eclipse-java-2019-*-R-linux-gtk-x86_64.tar.gz -C /opt/
   - sudo ln -s /opt/eclipse/eclipse /usr/bin/eclipse
2. Install eclim
   - go to http://eclim.org/install.html#download and follow instructions
   - sudo ./eclim_*.bin (follow the prompts from there)
   - Add this to .emacs file
     (require 'eclim)
     (add-hook 'java-mode-hook 'eclim-mode)
3. Start eclim server
   - M-x start-eclimd
   - NOTE* could be that the bin is in wrong place 'M-x customize-variable RET eclimd-executable' 

REFERENCE: http://www.goldsborough.me/emacs,/java/2016/02/24/22-54-16-setting_up_emacs_for_java_development/
