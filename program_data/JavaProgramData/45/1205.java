package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String zfc = new String(new char[102]);
		  char[][] ip = new char[2][50];

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
			else if (zfc.charAt(i) == ' ' || zfc.charAt(i) == '\0')
			{
			   ip[j][k] = '\0';
			   j++;
			   k = 0;
			}
		  }
		  //printf("%s %s",ip[0],ip[1]);
		  int len1 = String.valueOf(ip[1]).length();
		  int len2 = String.valueOf(ip[0]).length();
		  //printf("%d %d",len1,len2);
		  int w;
	for (i = 0,j = 0;i < len1;i++)
	{
			if (ip[1][i] == ip[0][j])
			{
				w = i;
				for (k = 1;k < len2;k++)
				{
					if (ip[1][i + k] != ip[0][j + k])
					{
						j = 0;
						w = 0;
						break;
					}
				}
				if ((w = i) != 0)
				{
					break;
				}
			}
	}
	   System.out.printf("%d",w);


		  return 0;
	}


}
