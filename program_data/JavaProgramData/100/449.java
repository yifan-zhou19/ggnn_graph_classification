package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[350]);
	  int[] b = new int[26];
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  a = tempVar.charAt(0);
	  }
	  for (i = 0;i < 26;i++)
	  {
		b[i] = 0;
	  }
	  for (i = 0;a.charAt(i);i++)
	  {
		if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z')
		{
		  b[a.charAt(i) - 'a']++;
		}
	  }
	  for (i = 0;i < 26;i++)
	  {
		if (b[i] > 0)
		{
		  System.out.printf("%c=%d\n",i + 'a',b[i]);
		  j = 1;
		}
	  }
	  if (j == 0)
	  {
		System.out.print("No\n");
	  }
	  return 0;
	}


}

