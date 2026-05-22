#include <iostream>
using namespace std;

int main() {
    
    int ages[6]   = {18, 19, 20, 21, 18, 22};
    int scores[6] = {75, 82, 90, 68, 88, 79};

    cout << "--- Student Data ---\n";
    for (int i = 0; i < 6; i++) {
        cout << "Student " << i + 1 
             << ": Age = " << ages[i] 
             << ", CSC 301 Score = " << scores[i] << endl;
    }

    return 0;
}
