# Step 1: Create a feature branch
git checkout develop
git checkout -b feature/user-authentication

# Work on your feature, commit changes
git add .
git commit -m "Added user authentication"

# Step 2: Merge feature into develop
git checkout develop
git merge feature/user-authentication

# Step 3: Create a release branch
git checkout develop
git checkout -b release/1.0.0

1. Make any necessary changes:
**Update version numbers**.
**Fix any bugs**.
**Update documentation**.

No branch de lançamento, deves:
Atualizar os números de versão (por exemplo, atualizar ficheiros como pom.xml, package.json ou outro ficheiro de versão);
Corrigir eventuais erros identificados;
Atualizar a documentação (changelog, README, etc.).

Commit any changes you made:

# Prepare for production release
git add.
git commit -m "Release version 1.0.0"
git push origin release/1.0.0


# Step 4: Merge the release into main and develop
git checkout main
git merge release/1.0.0
git checkout develop
git merge release/1.0.0

# Step 5: Create a hotfix if needed
git checkout main
git checkout -b hotfix/critical-bug

# Fix the bug and commit changes
git add .
git commit -m "Fixed critical production bug"

# Step 6: Merge the hotfix back into main and develop
git checkout main
git merge hotfix/critical-bug
git checkout develop
git merge hotfix/critical-bug
