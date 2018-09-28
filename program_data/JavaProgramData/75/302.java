package <missing>;

public class GlobalMembers
{
	public static int change(String a)
	{
	 int i;
	 int l;
	 int s;
	 l = a.length();
	 s = 0;
	 for (i = 0;i < l;i++)
	 {
	  s = s * 10 + a[i] - '0';
	 }
	 return (s);
	}
	public static int Main()
	{
	 String a = new String(new char[5000]);
	 String b = new String(new char[5000]);
	 String s = new String(new char[10]);
	 int[][] c = new int[2][1000];
	 int[] t = new int[1000];
	 int l;
	 int i;
	 int j;
	 int k;
	 int t1;
	 int t2;
	 int x;
	 int m;
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 l = a.length();
	 j = 0;
	 k = 0;
	 for (i = 0;i < l;i++)
	 {
	  if (a.charAt(i) != ',')
	  {
	   s = tangible.StringFunctions.changeCharacter(s, j, a.charAt(i));
	   j++;
	  }
	  else
	  {
	   s = tangible.StringFunctions.changeCharacter(s, j, '\0');
	   c[0][k] = change(s);
	   s = tangible.StringFunctions.changeCharacter(s, 0, '\0');
	   j = 0;
	   k++;
	  }
	 }
	 s = tangible.StringFunctions.changeCharacter(s, j, '\0');
	 c[0][k] = change(s);
	 s = tangible.StringFunctions.changeCharacter(s, 0, '\0');
	 l = b.length();
	 j = 0;
	 k = 0;
	 for (i = 0;i < l;i++)
	 {
	  if (b.charAt(i) != ',')
	  {
	   s = tangible.StringFunctions.changeCharacter(s, j, b.charAt(i));
	   j++;
	  }
	  else
	  {
	   s = tangible.StringFunctions.changeCharacter(s, j, '\0');
	   c[1][k] = change(s);
	   s = tangible.StringFunctions.changeCharacter(s, 0, '\0');
	   j = 0;
	   k++;
	  }
	 }
	 s = tangible.StringFunctions.changeCharacter(s, j, '\0');
	 c[1][k] = change(s);
	 t1 = c[0][0];
	 for (i = 1;i <= k;i++)
	 {
	  if (c[0][i] < t1)
	  {
	   t1 = c[0][i];
	  }
	 }
	 t2 = c[1][0];
	 for (i = 1;i <= k;i++)
	 {
	  if (c[1][i] > t2)
	  {
	   t2 = c[1][i];
	  }
	 }
	 for (i = t1;i < t2;i++)
	 {
	  m = i - t1;
	  for (j = 0;j <= k;j++)
	  {
	   if (c[0][j] <= i != 0 && c[1][j]> i)
	   {
		t[m]++;
	   }
	  }
	 }
	 x = t[0];
	 for (i = 0;i < t2 - t1;i++)
	 {
	  if (t[i] > x)
	  {
	   x = t[i];
	  }
	 }
	 System.out.printf("%d %d",k + 1,x);
	 return 0;
	}

}

