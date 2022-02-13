package io.flutter.plugins;

import io.flutter.plugin.common.PluginRegistry;
import com.example.flutter_sms.FlutterSmsPlugin;
import com.babariviere.sms.SmsPlugin;
import com.csdcorp.speech_to_text.SpeechToTextPlugin;
import io.flutter.plugins.urllauncher.UrlLauncherPlugin;

/**
 * Generated file. Do not edit.
 */
public final class GeneratedPluginRegistrant {
  public static void registerWith(PluginRegistry registry) {
    if (alreadyRegisteredWith(registry)) {
      return;
    }
    FlutterSmsPlugin.registerWith(registry.registrarFor("com.example.flutter_sms.FlutterSmsPlugin"));
    SmsPlugin.registerWith(registry.registrarFor("com.babariviere.sms.SmsPlugin"));
    SpeechToTextPlugin.registerWith(registry.registrarFor("com.csdcorp.speech_to_text.SpeechToTextPlugin"));
    UrlLauncherPlugin.registerWith(registry.registrarFor("io.flutter.plugins.urllauncher.UrlLauncherPlugin"));
  }

  private static boolean alreadyRegisteredWith(PluginRegistry registry) {
    final String key = GeneratedPluginRegistrant.class.getCanonicalName();
    if (registry.hasPlugin(key)) {
      return true;
    }
    registry.registrarFor(key);
    return false;
  }
}
