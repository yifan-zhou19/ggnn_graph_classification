package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	 char[][] a = new char[300][50];
	 String s = new String(new char[1000]);
	  s = new Scanner(System.in).nextLine();
	  int i;
	  int[] l = new int[300];
	  int g = 0;
	  for (i = 0;i < s.length();i++)
	  {
		  if (s.charAt(i) == ' ' && s.charAt(i - 1) != ' ')
		  {
	   g++;
		  }
	  }
	  g = g + 1;
	  int j = 1;
	  for (i = 0;i < s.length();i++)
	  {
		if (s.charAt(i) != ' ')
		{
			l[j]++;
		}
		else
		{
		if (s.charAt(i + 1) != ' ')
		{
			j++;
		}
		}
	  }
	  for (i = 1;i < g;i++)
	  {
	   System.out.printf("%d,",l[i]);
	  }
	  System.out.printf("%d",l[g]);


	}

}
