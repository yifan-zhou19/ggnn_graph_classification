package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] len = new int[50];
	int mark = 0;
	int a = 0;
	int b;
	int B = 0;
	int i;
	int n;
	int minIndex;
	int maxIndex;
	String s = new String(new char[999]);
	char[][] zfc = new char[50][50];
	s = new Scanner(System.in).nextLine();

	for (a = 0;a < 50;a++)
	{
		for (b = B,i = 0;b < 999,i < 50;b++,i++)
		{
			if ((s.charAt(b) != ' ') && (s.charAt(b) != '\0'))
			{
			zfc[a][i] = s.charAt(b);
			}
			else if ((s.charAt(b) == ' ') && (s.charAt(b) != '\0'))
			{
			mark++;
			B = b + 1;
			break;
			}
			else if (s.charAt(b) == '\0')
			{
				mark++;
				break;
			}

			zfc[a][i + 1] = '\0';
		}
			if (s.charAt(b) == '\0')
			{
				break;
			}

	//printf("zfc a %s\n",zfc[a]);
	}

	for (n = 0;n < mark;n++)
	{
					len[n] = String.valueOf(zfc[n]).length();
	}

	maxIndex = 0;
	minIndex = 0;
	for (n = 1;n < mark;n++)
	{
					 if (len[n] > len[maxIndex])
					 {
					   maxIndex = n;
					 }
					else if (len[n] < len[minIndex])
					{
							minIndex = n;
					}
	}
	System.out.printf("%s\n%s\n",zfc[maxIndex],zfc[minIndex]);

	return 0;
	}
}
