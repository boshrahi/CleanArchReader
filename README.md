# CleanArchReader
A sample android project in clean architecture

The app provides a simple PDF reader in 2 parts: library and reader

# Library
In this section, the user can add any PDF file from the phone storage.
The list shows names and sizes.

# Reader
PDF renderer shows the PDF file and the user can bookmark any pages. 
The bookmarks are saved into the database and are available anytime.

# Architecture
The app includes two modules of App and Core.

App Module has 2 layers:
  1. Presentation
  2. Framework

Core Module layers:
  1. UseCases
  2. DataLayer:
    2.1 Repositories
    2.2 DataSources
  3. Domain Layer
    3.1 Models
