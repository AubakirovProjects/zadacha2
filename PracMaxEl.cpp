#include <iostream>
#include <vector>
using namespace std;


int main(){
    int n;
    cout << "Kolichestvo elementov:";
    cin >> n;
    vector<int> arr(n);
    cout << "Vvedite elementy massiva:";
    for (int i=0; i < n; ++i){
        cin>>arr[i];
    }
    int maxElement = 0;
    for (int i=0; i<n; ++i){
        if (maxElement < arr[i]){
            maxElement = arr[i];
        }
    }
    cout << "minimalny element massiva:" << maxElement << endl;
    return 0;
}