# News App 📰
[![Kotlin](https://img.shields.io/badge/Kotlin-1.9.0-blue.svg)](https://kotlinlang.org/)
[![Android](https://img.shields.io/badge/Android-API%2021+-green.svg)](https://developer.android.com/)
[![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-Latest-brightgreen.svg)](https://developer.android.com/jetpack/compose)
A modern Android news application built with Jetpack Compose following Clean Architecture principles. The app provides users with personalized news feeds, search functionality, bookmarking capabilities, and a seamless reading experience.


## 📱 Screenshots

### Onboarding Flow
<div align="center">
  <img src="screenshots/onboarding_1.png" width="250" alt="Onboarding Page 1" />
  <img src="screenshots/onboarding_2.png" width="250" alt="Onboarding Page 2" />
  <img src="screenshots/onboarding_3.png" width="250" alt="Onboarding Page 3" />
</div>

*Three-step onboarding process introducing users to the app's key features*

### Main Features
<div align="center">
  <img src="screenshots/home_screent.png" width="250" alt="Home Screen Dark" />
  <img src="screenshots/search_screen.png" width="250" alt="Search Screen" />
</div>

*Home screen with news feed and Search functionality*

<div align="center">
  <img src="screenshots/article_detail.png" width="250" alt="Article Detail" />
  <img src="screenshots/bookmark_screen.png" width="250" alt="Bookmarks" />
</div>

*Article detail view, Bookmarks screen, and Empty state*

## ✨ Features

### Core Functionality
- **📰 News Feed**: Latest articles from trusted sources (BBC, ABC News, Al Jazeera)
- **🔍 Search**: Real-time search with auto-suggestions
- **🔖 Bookmarks**: Save articles for offline reading
- **📖 Article Reader**: Full article view with sharing options
- **🌓 Dark/Light Theme**: Automatic theme switching
- **📱 Responsive UI**: Optimized for different screen sizes

### Technical Features
- **🚀 Infinite Scrolling**: Seamless pagination
- **💾 Offline Support**: Room database for local storage
- **🔄 Pull to Refresh**: Update news feed
- **⚡ Fast Loading**: Efficient image caching with Coil
- **🎯 State Management**: Robust state handling with ViewModels
- **🧭 Navigation**: Smooth navigation with Navigation Compose


## 📁 Project Structure

```
com.loc.newsapp/
├── 📱 MainActivity.kt                 # Entry point
├── 🔧 MainViewModel.kt               # Splash & navigation logic
├── 🏠 NewsApplication.kt             # Application class
│
├── 💾 data/
│   ├── local/                        # Database layer
│   │   ├── 📊 NewsDao.kt            # Data access object
│   │   ├── 🗄️ NewsDatabase.kt       # Room database
│   │   └── 🔄 NewsTypeConvertor.kt  # Type converters
│   ├── manager/                      # Data management
│   │   └── 👤 LocalUserManagerImpl.kt # User preferences
│   ├── remote/                       # Network layer
│   │   ├── 🌐 NewsApi.kt            # Retrofit API interface
│   │   ├── 📄 NewsPagingSource.kt   # Pagination for news
│   │   ├── 🔍 SearchNewsPagingSource.kt # Pagination for search
│   │   └── dto/
│   │       └── 📋 NewsResponse.kt    # API response models
│   └── repository/
│       └── 🏪 NewsRepositoryImpl.kt  # Repository implementation
│
├── 🎯 domain/
│   ├── manager/
│   │   └── 👤 LocalUserManager.kt    # User manager interface
│   ├── model/                        # Domain models
│   │   ├── 📰 Article.kt            # Article entity
│   │   └── 📡 Source.kt             # News source entity
│   ├── repository/
│   │   └── 🏪 NewsRepository.kt      # Repository interface
│   └── usecases/                     # Business logic
│       ├── app_entry/               # Onboarding use cases
│       │   ├── 📦 AppEntryUseCases.kt
│       │   ├── 📖 ReadAppEntry.kt
│       │   └── 💾 SaveAppEntry.kt
│       └── news/                    # News-related use cases
│           ├── 🗑️ DeleteArticle.kt
│           ├── 📰 GetNews.kt
│           ├── 📦 NewsUseCases.kt
│           ├── 🔍 SearchNews.kt
│           ├── 📖 SelectArticle.kt
│           ├── 📚 SelectArticles.kt
│           └── 💾 UpsertArticle.kt
│
├── 🎨 presentation/
│   ├── 📏 Dimens.kt                  # Dimension constants
│   ├── bookmark/                     # Bookmark feature
│   │   ├── 📱 BookmarkScreen.kt
│   │   ├── 📊 BookmarkState.kt
│   │   └── 🧠 BookmarkViewModel.kt
│   ├── common/                       # Reusable components
│   │   ├── 🎴 ArticleCard.kt        # Article card component
│   │   ├── 📋 ArticlesList.kt       # Articles list with pagination
│   │   ├── ❌ EmptyScreen.kt         # Empty state component
│   │   ├── 🔘 NewsButton.kt         # Custom buttons
│   │   ├── 🔍 SearchBar.kt          # Search input component
│   │   └── ✨ ShimmerEffect.kt      # Loading animation
│   ├── detail/                       # Article detail feature
│   │   ├── 📱 DetailScreen.kt
│   │   ├── ⚡ DetailEvent.kt
│   │   ├── 🧠 DetailViewModel.kt
│   │   └── components/
│   │       └── 🔝 DetailsTopBar.kt   # Detail screen toolbar
│   ├── home/                         # Home feature
│   │   ├── 📱 HomeScreen.kt
│   │   └── 🧠 HomeViewModel.kt
│   ├── navgraph/                     # Navigation
│   │   ├── 🧭 NavGraph.kt           # Navigation graph
│   │   └── 🛤️ Route.kt              # Route definitions
│   ├── news_navigator/               # Bottom navigation
│   │   ├── 📱 NewsNavigator.kt
│   │   └── components/
│   │       └── 📱 NewsBottomNavigation.kt
│   ├── onboarding/                   # Onboarding flow
│   │   ├── ⚡ OnBoardingEvents.kt
│   │   ├── 📱 OnBoardingScreen.kt
│   │   ├── 🧠 OnBoardingViewModel.kt
│   │   ├── 📄 Page.kt               # Onboarding page data
│   │   └── components/
│   │       ├── 📄 OnBoardingPage.kt
│   │       └── 🔘 PageIndicator.kt
│   ├── search/                       # Search feature
│   │   ├── ⚡ SearchEvent.kt
│   │   ├── 📱 SearchScreen.kt
│   │   ├── 📊 SearchState.kt
│   │   └── 🧠 SearchViewModel.kt
│   └── ui/theme/                     # Theming
│       ├── 🎨 Color.kt              # Color palette
│       ├── 🎨 Theme.kt              # Theme configuration
│       └── ✍️ Type.kt               # Typography
│
├── 🔧 di/
│   └── 📦 AppModule.kt               # Dependency injection
│
└── 🔧 util/
    └── 📋 Constants.kt               # App constants
```

## 🚀 Getting Started

### Prerequisites
- **Android Studio**: Arctic Fox (2020.3.1) or newer
- **Android SDK**: API level 21 (Android 5.0) or higher
- **Kotlin**: 1.8.0 or newer
- **Minimum SDK**: 21
- **Target SDK**: 34
- **Java**: JDK 11 or newer

### 📋 Setup Instructions

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/news-app.git
   cd news-app
   ```

2. **Get NewsAPI Key** 🔑
   - Visit [NewsAPI.org](https://newsapi.org)
   - Sign up for a free account
   - Generate your API key
   - Replace the placeholder in `util/Constants.kt`:
   ```kotlin
   const val API_KEY = "your_actual_api_key_here"
   ```

3. **Open in Android Studio** 
   - Launch Android Studio
   - Click "Open an Existing Project"
   - Navigate to the cloned directory
   - Wait for Gradle sync to complete

4. **Build and Run** ▶️
   ```bash
   ./gradlew assembleDebug
   ```
   Or use Android Studio's run button

### 🔧 Configuration

#### News Sources
The app currently fetches news from these sources:
- **BBC News** (`bbc-news`)
- **ABC News** (`abc-news`) 
- **Al Jazeera English** (`al-jazeera-english`)

To add more sources, update the source lists in:
- `presentation/home/HomeViewModel.kt`
- `presentation/search/SearchViewModel.kt`


## 🌐 API Integration

### NewsAPI Endpoints
- **Base URL**: `https://newsapi.org/v2/`
- **Get News**: `GET /everything?sources={sources}&page={page}&apiKey={key}`
- **Search News**: `GET /everything?q={query}&sources={sources}&page={page}&apiKey={key}`

### Request Parameters
- `sources`: Comma-separated news source IDs
- `page`: Page number for pagination (starts from 1)
- `apiKey`: Your NewsAPI authentication key
- `q`: Search query (for search endpoint)
- `pageSize`: Articles per page (default: 20, max: 100)

### Response Format
```json
{
  "status": "ok",
  "totalResults": 1234,
  "articles": [
    {
      "source": {
        "id": "bbc-news",
        "name": "BBC News"
      },
      "author": "Author Name",
      "title": "Article Title",
      "description": "Article description...",
      "url": "https://...",
      "urlToImage": "https://...",
      "publishedAt": "2024-01-01T00:00:00Z",
      "content": "Article content..."
    }
  ]
}
```

### Development Workflow
1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Follow** the existing code style and architecture
4. **Write** tests for new functionality
5. **Commit** your changes (`git commit -m 'Add amazing feature'`)
6. **Push** to the branch (`git push origin feature/amazing-feature`)
7. **Open** a Pull Request

---

**Happy Coding**
