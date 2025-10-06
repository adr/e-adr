# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](http://keepachangelog.com/)
and this project adheres to [Semantic Versioning](http://semver.org/).

## [unreleased]

### Added

- Refined example in `README.md`
- Added `@ADRref` annotation to allow referencing ADRS having an arbitrary identifier syntax (and not numbers only). [#29](https://github.com/adr/e-adr/pull/29)

### Changed

- Updated minimal requirement to Java 17.
- Move `@ADR` annotation to `io.github.adr.linked` package to strengthen that it is a link.
- Changed module name to `io.github.adr` (because offer both `.linked` and `.embedded` packages).

### Fixed

- Fix typo in `ArchitecturallySignificant` and `ArchitecturalStyle`

### Removed

- Removed `@Alternatives` annotation, because it was not well-defined. Follow up is [#22](https://github.com/adr/e-adr/issues/22).

## [1.0.0] – 2017-09-10

First release of embedded ADRs.

[unreleased]: https://github.com/adr/e-adr/compare/1.0.0...main
[1.0.0]: https://github.com/adr/e-adr/releases/tag/1.0.0
