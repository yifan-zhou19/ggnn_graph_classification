int tree = new int(int,int); // ??????
int power = new int(int,int); // ??????
int main()
{
 int x;
 int y;
 x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
 System.out.print(tree(x,y));
 System.out.print("\n");
 return 0;
}
int tree(int a, int b)
{
 int i;
 int c;
 for (i = 0;i < 11;i++)
 {
  c = a / power(2,i);
  if (b == c)
  {
   return b;
  }
 }
 for (i = 0;i < 11;i++)
 {
  c = b / power(2,i);
  if (a == c)
  {
   return a;
  }
 }
 if (a == 1 || b == 1)
 {
  return 1;
 }
 return tree(a / 2,b / 2);
}
int power(int m,int n)
{
 int j;
 int sum = 1;
 for (j = 0;j < n;j++)
 {
  sum = sum * m;
 }
 return sum;
}





