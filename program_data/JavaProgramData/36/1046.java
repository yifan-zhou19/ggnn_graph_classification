package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l1;
		int l2;
		int i;
		int s1 = 0;
		int s2 = 0;
	  String a = new String(new char[300]);
	  String b = new String(new char[300]);
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
	  l1 = a.length();
	  l2 = b.length();
	  if (l1 != l2)
	  {
		  System.out.print("NO");
	  }
	  else
	  {
		  for (i = 0;i < l1;i++)
		  {
			  s1 += a.charAt(i);
			  s2 += b.charAt(i);
		  }
		  if (s1 == s2)
		  {
			  System.out.print("YES");
		  }
		  else
		  {
		  System.out.print("NO");
		  }
	  }

	}
}

