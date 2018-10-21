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
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 s = tempVar.charAt(0);
	 }
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
	  for (j = 0;j < p - 1;j++)
	  {
	   if (s.charAt(j) == c && s.charAt(j + 1) == d)
	   {
		System.out.printf("%d %d\n",a[j],a[j + 1]);
		for (k = j + 2;k < p;k++)
		{
		 s = tangible.StringFunctions.changeCharacter(s, k - 2, s.charAt(k));
		 a[k - 2] = a[k];
		}
		break;
	   }
	  }
	  p = p - 2;
	 }
	 System.in.read();
	 System.in.read();
	 return 0;

	}

}

