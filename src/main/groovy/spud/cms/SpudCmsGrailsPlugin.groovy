package spud.cms

import grails.plugins.*
import groovy.util.logging.Slf4j
import org.springframework.context.support.ReloadableResourceBundleMessageSource
import org.springframework.web.servlet.i18n.CookieLocaleResolver
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor

@Slf4j
class SpudCmsGrailsPlugin extends Plugin {

	// the version or versions of Grails the plugin is designed for
	def grailsVersion = "3.3.7 > *"
	// resources that are excluded from plugin packaging
	def pluginExcludes = [
		"grails-app/views/error.gsp"
	]

	// TODO Fill in these fields
	def title = "Spud Cms Plugin" // Headline display name of the plugin
	def author = "David Estes"
	def authorEmail = "destes@bcap.com"
	def description = '''\
Provides CMS functionality for Spud
'''
	def profiles = ['web']

	// URL to the plugin's documentation
	def documentation = "http://grails.org/plugin/spud-cms"

	// Extra (optional) plugin metadata

	// License: one of 'APACHE', 'GPL2', 'GPL3'
	def license = "APACHE"

	// Details of company behind the plugin (if there is one)
//    def organization = [ name: "My Company", url: "http://www.my-company.com/" ]
	def organization = [name: "Bertram Labs", url: "http://www.bertramlabs.com/"]

	// Any additional developers beyond the author specified above.
//    def developers = [ [ name: "Joe Bloggs", email: "joe@bloggs.net" ]]

	// Location of the plugin's issue tracker.
//    def issueManagement = [ system: "JIRA", url: "http://jira.grails.org/browse/GPMYPLUGIN" ]
	def issueManagement = [system: "GITHUB", url: "https://github.com/spud-grails/spud-cms/issues"]

	// Online location of the plugin's browseable source code.
//    def scm = [ url: "http://svn.codehaus.org/grails-plugins/" ]

	Closure doWithSpring() { {->
		// TODO Implement runtime spring config (optional)
		/*
		messageSource(ReloadableResourceBundleMessageSource) {
			basename = "WEB-INF/grails-app/i18n/messages"
		}
		localeChangeInterceptor(LocaleChangeInterceptor) {
			paramName = "lang"
		}
		localeResolver(CookieLocaleResolver)
		*/
	}
	}

	void doWithDynamicMethods() {
		// TODO Implement registering dynamic methods to classes (optional)
	}

	void doWithApplicationContext() {
		// TODO Implement post initialization spring config (optional)
	}

	void onChange(Map<String, Object> event) {
		// TODO Implement code that is executed when any artefact that this plugin is
		// watching is modified and reloaded. The event contains: event.source,
		// event.application, event.manager, event.ctx, and event.plugin.
	}

	void onConfigChange(Map<String, Object> event) {
		// TODO Implement code that is executed when the project configuration changes.
		// The event is the same as for 'onChange'.
	}

	void onShutdown(Map<String, Object> event) {
		// TODO Implement code that is executed when the application shuts down (optional)
	}
}
