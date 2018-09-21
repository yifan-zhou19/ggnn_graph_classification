package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int n;
	  int i;
	  int j;
	  int[] l = new int[50];
	  int max;
	  int min;
	  String sen = new String(new char[1000]);
	  char[][] w = new char[50][20];
	  sen = new Scanner(System.in).nextLine();
	  n = sen.length();
	  for (i = 0;i < 50;i++)
	  {
		  l[i] = 0;
	  for (j = 0;j < 20;j++)
	  {
	  w[i][j] = '\0';
	  }
	  }
	  j = 0;
	  for (i = 0;i < n;i++)
	  {
		   if (sen.charAt(i) != ' ')
		   {
				w[j][l[j]] = sen.charAt(i);
				l[j]++;
		   }
		   else
		   {
			   j++;
		   }
	  }
	  max = l[0];
	  min = l[0];
	  for (i = 0;i <= j;i++)
	  {
		   if (max < l[i])
		   {
			   max = l[i];
		   }
		   if (min > l[i])
		   {
			   min = l[i];
		   }
	  }
	  for (i = 0;i <= j;i++)
	  {
		   if (l[i] == max)
		   {
				System.out.printf("%s\n",w[i]);
				break;
		   }
	  }
	  for (i = 0;i <= j;i++)
	  {
		   if (l[i] == min)
		   {
				System.out.printf("%s\n",w[i]);
				break;
		   }
	  }

	}

}
