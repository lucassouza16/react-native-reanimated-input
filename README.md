
# react-native-teste-library

## Getting started

`$ npm install react-native-teste-library --save`

### Mostly automatic installation

`$ react-native link react-native-teste-library`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-teste-library` and add `RNTesteLibrary.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNTesteLibrary.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNTesteLibraryPackage;` to the imports at the top of the file
  - Add `new RNTesteLibraryPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-teste-library'
  	project(':react-native-teste-library').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-teste-library/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-teste-library')
  	```


## Usage
```javascript
import RNTesteLibrary from 'react-native-teste-library';

// TODO: What to do with the module?
RNTesteLibrary;
```
  