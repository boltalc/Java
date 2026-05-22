#include <iostream>
using namespace std;

int main() {

    int students[2][6] = {
        {18, 19, 20, 21, 18, 22},
        {75, 82, 90, 68, 88, 79}    
    };

    cout << "--- Student Ages and CSC 301 Scores ---\n";

    for (int i = 0; i < 6; i++) {
        cout << "Student " << i + 1
             << ": Age = " << students[0][i]
             << ", Score = " << students[1][i] << endl;
    }

    return 0;
}
