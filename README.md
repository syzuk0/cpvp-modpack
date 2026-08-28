# CPvP Black & White Mod Pack

A Minecraft Fabric mod pack focused on Capture the Flag (CTF) PvP gameplay. This mod provides custom textures, sounds, and configurations optimized for competitive PvP battles.

## Features

- 🎮 Custom item textures optimized for CTF gameplay
- 🔊 Custom sound replacements for enhanced audio experience
- ⚙️ Configurable gameplay settings
- 🎯 Balanced for competitive PvP
- 📦 Built on Fabric for performance

## Supported Items

- End Crystal
- Ender Pearl
- Golden Apple
- Enchanted Golden Apple
- Totem of Undying
- Obsidian
- And more...

## Installation

### Requirements

- Minecraft 1.20.1
- Fabric Loader 0.14.21+
- Fabric API 0.91.0+

### Steps

1. Download the latest release
2. Place the mod file in your `.minecraft/mods` folder
3. Launch Minecraft with the Fabric profile
4. Enjoy!

## Building from Source

### Prerequisites

- Java 17 or higher
- Gradle

### Build

```bash
./gradlew build
```

The built mod will be located in `build/libs/`

## Configuration

Configuration options can be modified in the `Config.java` file:

- `ENABLE_ITEM_TEXTURES` - Toggle custom item textures
- `ENABLE_SOUND_REPLACEMENTS` - Toggle sound replacements
- `ENABLE_CUSTOM_ITEMS` - Toggle custom item features
- `AMBIENT_SOUND_VOLUME` - Adjust ambient sound volume

## Project Structure

```
CPvP-Black-White/
├── src/main/java/com/angel/cpvpbw/
│   ├── CpvpBlackWhite.java      # Main mod class
│   ├── SoundManager.java         # Sound handling
│   └── Config.java               # Configuration
├── src/main/resources/
│   ├── assets/cpvpbw/            # Game assets
│   │   ├── textures/             # Item and block textures
│   │   ├── sounds/               # Custom sounds
│   │   └── lang/                 # Language files
│   └── fabric.mod.json           # Mod metadata
└── build.gradle                  # Gradle build config
```

## Contributing

Contributions are welcome! Feel free to submit issues and pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

For issues, questions, or suggestions, please open an issue on [GitHub](https://github.com/syzuk0/cpvp-modpack/issues).

---

Made with ❤️ for the CTF PvP community