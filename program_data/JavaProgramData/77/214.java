package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int l;
	 int i;
	 int j;
	 int k;
	 int p;
	 String s = new String(new char[10000]);
	 int[] a = new int[10000];
	 char c;
	 char d;
	 //int q[10000];
	 s = new Scanner(System.in).nextLine();
	 l = s.length();
	 p = l;
	 c = s.charAt(0);
	 d = s.charAt(l - 1);
	 for (i = 0;i < l;i++)
	 {
	  a[i] = i;
	 }
	 for (i = 0;i < l / 2;i++)
	 {
	  for (j = 1;j < p;j++)
	  {
	   if (s.charAt(j - 1) == c && s.charAt(j) == d)
	   {
		System.out.printf("%d %d\n",a[j - 1],a[j]);
		for (k = j + 1;k < p;k++)
		{
		 s = tangible.StringFunctions.changeCharacter(s, k - 2, s.charAt(k));
		 a[k - 2] = a[k];
		}
		break;
	   }
	  }
	  p = p - 2;
	 }
	 return 0;
	}


}

