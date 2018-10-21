package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String a = new String(new char[200]);
	 String b = new String(new char[200]);
	 int[] m = new int[100];
	 int[] n = new int[100];
	 int k;
	 int l;
	 int i;
	 int j;
	 int e = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = tempVar.charAt(0);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 b = tempVar2.charAt(0);
	 }
	 k = a.length();
	 l = b.length();
	 if (k != l)
	 {
	  System.out.print("NO");
	 }
	  if (k == l)
	  {
	   for (i = 0; i < k; i++)
	   {
		for (j = 0; j < k; j++)
		{
		 if (a.charAt(i) == b.charAt(j))
		 {
		  b = tangible.StringFunctions.changeCharacter(b, j, 1);
		  e++;
		  break;
		 }
		}
	   }
		if (e == k)
		{
		 System.out.print("YES");
		}
		else
		{
		System.out.print("NO");
		}
	  }
	return 0;
	}
}

