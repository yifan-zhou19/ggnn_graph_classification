package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str1 = new String(new char[200]);
	  String str2 = new String(new char[200]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  str2 = tempVar2.charAt(0);
	  }
	  int[] c = new int[200];
	  int a;
	  int b;
	  int l1;
	  int l2;
	  int i;
	  int l = 0;
	  l1 = (int)str1.length();
	  l2 = (int)str2.length();
	  while (l1 > 0 || l2 > 0)
	  {
		 a = l1 > 0?str1.charAt(l1 - 1) - '0':0;
		 b = l2 > 0?str2.charAt(l2 - 1) - '0':0;
		 c[l + 1] = (c[l] + a + b) / 10;
		 c[l] = (c[l] + a + b) % 10;
		 l1--;
		 l2--;
		 l++;
	  }
	while (l > 0 && c[l] == 0)
	{
	 l--;
	}
	for (i = l;i >= 0;i--)
	{
	  System.out.printf("%d",c[i]);
	}

	}
}

