int[] Boy = new int[100];
int[] Girl = new int[100];
int BoyNum;
int GirlNum;
char Boychar;
void function(int);
int main()
{
 BoyNum = 1;
 GirlNum = 0;
 Boy[BoyNum] = 0;
 Boychar = System.in.read();
 function(1);
 return 0;
}
void function(int p)
{
 char c;
 c = System.in.read();
 if (c == '\n')
 {
  return;
 }
 else
 {
  if (c == Boychar)
  {
   Boy[BoyNum] = p;
   BoyNum++;
   GirlNum++;
   function(p + 1);
  }
  else
  {
   Girl[GirlNum] = p;
   System.out.print(Boy[GirlNum]);
   System.out.print(" ");
   System.out.print(Girl[GirlNum]);
   System.out.print("\n");
   GirlNum--;
   BoyNum--;
   function(p + 1);
  }
 }
}
