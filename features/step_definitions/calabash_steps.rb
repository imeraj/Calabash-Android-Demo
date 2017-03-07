require 'calabash-android/calabash_steps'

Given(/^I type Username and Password$/) do
    enter_text("android.support.v7.widget.AppCompatEditText id:'usernameInput'", "Meraj")
    sleep 0.5
    enter_text("android.support.v7.widget.AppCompatEditText id:'passwordInput'", "Secret")
end
