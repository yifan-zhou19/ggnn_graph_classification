package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String s = new String(new char[300]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  s = tempVar.charAt(0);
	  }
	  int i = 0;
	  int[] up = new int[26];
	  int[] down = new int[26];
	  int a = 0;
	  while (s.charAt(i) != '\0')
	  {
		  if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
		  {
			  up[s.charAt(i) - 'A']++;
		  }
		  else
		  {
			  if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			  {
				  down[s.charAt(i) - 'a']++;
			  }
			  else
			  {
			  a++;
			  }
		  }
		  i++;
	  }
	  if (a == i)
	  {
		  System.out.print("No");
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
	  return 0;
	}

}

