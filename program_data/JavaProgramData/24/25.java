package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] str = new char[80][80];
		String str1 = new String(new char[80]);
		int i = 0;
		int j = 0;
		int min = 80;
		int max = 0;
		int num = 0;
		int k;
		int t;
		int len;
		int len1;
		int lens;
		str1 = new Scanner(System.in).nextLine();
		lens = str1.length();
	  for (j = 0;str1.charAt(j) != '\0';j++)
	  {
			str[num][i++] = str1.charAt(j);
			k = i;
			if (str1.charAt(j) == ' ' || str1.charAt(j) == '\n')
			{
				str[num][i - 1] = '\0';
				num++;
					i = 0;
			}
			t = num;

	  }
		str[t][k] = '\0';
		for (i = lens - 1;;i--)
		{
			if (str1.charAt(i) == ' ')
			{
				k = i;
				break;
			}
		}
			 j = 0;
		   for (i = k + 1;i < lens;i++)
		   {
	   str[t + 1][j++] = str1.charAt(j);
		   }
	   str[t + 1][j] = '\0';
		for (i = 0;i < t + 1;i++)
		{
			len1 = String.valueOf(str[i]).length();
			max = max > len1 != 0?max:len1;
			min = min < len1 != 0?min:len1;
		}
		for (i = 0;i < t + 1;i++)
		{
			 len = String.valueOf(str[i]).length();
			if (max == len)
			{
				System.out.printf("%s\n",str[i]);
				break;
			}
		}
		for (i = 0;i < t + 1;i++)
		{
			len = String.valueOf(str[i]).length();
			if (min == len)

			{
				System.out.printf("%s\n",str[i]);
				break;
			}
		}
	}





}
