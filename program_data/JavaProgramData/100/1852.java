package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[N]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  int i;
	  int k = 0;
	  int[] up = new int[26];
	  int[] down = new int[26];
	  for (i = 0;i < N && s.charAt(i) != 0;i++)
	  {
		if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
		{
		  up[s.charAt(i) - 'A']++;
		}
		else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
		{
		  down[s.charAt(i) - 'a']++;
		}
		else
		{
		  k++;
		}
	  }
	  for (i = 0;i < 26;i++)
	  {
		if (up[i] != 0)
		{
		  System.out.printf("%c=%d\n",i + 'A',up[i]);
		}
	  }
	for (i = 0;i < 26;i++)
	{
		if (down[i] != 0)
		{
		  System.out.printf("%c=%d\n",i + 'a',down[i]);
		}
	}
	  if (k == s.length())
	  {
		  System.out.print("No");
	  }
		return 0;
	}
}

