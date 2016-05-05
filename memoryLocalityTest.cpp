// MemoryLocalit Test
#include <iostream>
using namespace std;
const int d =10000;
int arr1 [d][d];
int arr2 [d][d];
void rowTest(){
    for(int i=0;i<d;++i)
        for(int j=0;j<d;++j)
        {
            arr1[i][j]=i*10+j;
            arr2[i][j]=i*10+j;
        }
}

void colTest(){
    for(int i=0;i<d;++i)
        for(int j=0;j<d;++j)
        {
            arr1[j][i]=i*10+j;
            arr2[j][i]=i*10+j;
        }
}

int main( )
{

    //colTest();//    time=5.944 s
    //rowTest();//    time=1.139 s
   return 0;
}
