package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int chu;
		  int yu = 0;
		  int count = 0;
		  int[] shang = new int[100];
		  int count2 = 0;
		  String a = new String(new char[100]);
		  a = new Scanner(System.in).nextLine();
		  for (i = 0;i < 100;i++)
		  {
							chu = yu * 10 + (int)(a.charAt(i) - '0');
							shang[i] = chu / 13;
							count2++;
							yu = chu % 13;
							if (a.charAt(i + 1) == '\0')
							{
								break;
							}
		  }
		  if (count2 == 1 || count2 == 2)
		  {
			  count = count2 - 1;
		  }
		  else if (shang[1] == 0)
		  {
			  count = 2;
		  }
		  else
		  {
			  count = 1;
		  }
		  for (i = count;i < count2;i++)
		  {
								   System.out.printf("%d",shang[i]);
		  }
		  System.out.printf("\n%d",yu);
	}
}
