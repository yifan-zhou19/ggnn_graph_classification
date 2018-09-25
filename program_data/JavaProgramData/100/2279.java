package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[301]);
		char[] s1 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		 int[] s2 = new int[52];
		int i;
		int x;
		int flag = 0;
		for (i = 0;i < 52;i++)
		{
			s2[i] = 0;
		}
		str = new Scanner(System.in).nextLine();
	  for (i = 0;i < str.length();i++)
	  {
		  for (x = 0;x < 52;x++)
		  {
			  if (s1[x] == str.charAt(i))
			  {
			  s2[x]++;
			  break;
			  }
		  }
	  }
	  for (i = 0;i < 52;i++)
	  {
		  if (s2[i] != 0)
		  {
			  System.out.printf("%c=%d\n",s1[i],s2[i]);
			  flag = 1;
		  }
	  }
	  if (flag == 0)
	  {
		  System.out.print("No");
	  }
		  return 0;
	}
}
