package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String zfc = new String(new char[25000]);
		  char[][] ip = new char[50][100];
		  int a;
		  int b;
		  int c;
		  int max = 0;
		  int min = ~(1 << 31);
		  zfc = new Scanner(System.in).nextLine();
		  int len = zfc.length();
		  int j = 0;
		  int k = 0;
		  int i;
		  for (i = 0;i < len + 1;i++)
		  {
			if (zfc.charAt(i) != ' ' && zfc.charAt(i) != '\0')
			{
			   ip[j][k] = zfc.charAt(i);
			   k++;
			}
			else
			{
			   ip[j][k] = '\0';
			   j++;
			   k = 0;
			}
		  }
		  for (i = 0;i < j;i++)
		  {
			  a = String.valueOf(ip[i]).length();
			  if (a > max)
			  {
				  b = i;
				  max = a;
			  }
			  if (a < min)
			  {
				  c = i;
				  min = a;
			  }
		  }
		  System.out.printf("%s\n%s\n",ip[b],ip[c]);
		  return 0;
	}

}
