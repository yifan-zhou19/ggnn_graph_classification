package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String sen = new String(new char[5000]);
		String[] a = {"0"};
		int i;
		int j;
		int k;
		int m;
		int[] b = new int[200];
		sen = new Scanner(System.in).nextLine();
		m = sen.length();
		k = 0;
		for (i = 0;i < 200;i++)
		{
			for (j = 0;k < m;j++)
			{
				  if (sen.charAt(k) == ' ')
				  {
					  k++;
					  a[i][j] = '\0';
					  break;
				  }
				  else if (sen.charAt(k) == ',')
				  {
					  k = k + 2;
					  a[i][j] = '\0';
					  break;
				  }
				  else
				  {
					  a[i][j] = sen.charAt(k);
				  }
			  k++;
			}
		}
		for (i = 0;a[i][0] != '\0';i++)
		{
			b[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;b[i + 1] != 0;i++)
		{
			if (b[i] > b[i + 1])
			{
				m = b[i];
				b[i] = b[i + 1];
				b[i + 1] = m;
			}
		}
		for (j = 0;;j++)
		{
			m = String.valueOf(a[j]).length();
			if (m == b[i])
			{
			 System.out.printf("%s\n",a[j]);
			 break;
			}
		}
		for (i = 0;b[i + 1] != 0;i++)
		{
			if (b[i] < b[i + 1])
			{
				m = b[i];
				b[i] = b[i + 1];
				b[i + 1] = m;
			}
		}
		for (j = 0;;j++)
		{
			m = String.valueOf(a[j]).length();
			if (m == b[i])
			{
			 System.out.printf("%s\n",a[j]);
			 break;
			}
		}
	}










}
