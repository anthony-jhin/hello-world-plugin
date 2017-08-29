package org.jenkinsci.plugins.hello;
import hudson.model.RootAction;
import hudson.Extension;

/**
test.
*/
@Extension
public class IntroRootAction implements RootAction {
     /** Returns icon file name.
     * @return icon file name
     */
     @Override
     public final String getIconFileName() {
     return "clipboard.png";
     }
     /** Returns user visible link text.
     * @return link display name
     */
     @Override
     public final String getDisplayName() {
     return "Intro Root Action";
     }
     /** Returns link destination URL.
     * @return link destination URL
     */
     @Override
     public final String getUrlName() {
     return "https://jenkins.io/";
     }
}
