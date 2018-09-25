import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static char x1;
	public static char x2;
	public static int sum = 0;
	public static int[][] c = new int[1000][1000];
	public static int doing(String b)
	{
		int i = 0;
		int j = 0;
		int z = 0;
		for (i = 0;i < sum;i++)
		{
	   if (b[i].equals(x1))
	   {
		   j = i + 1;
		   while (b[j].equals('\0'))
		   {
			   j++;
		   }
		   if (b[j].equals(x2))
		   {
			   c[i][j] = 1;
			   b[i] = '\0';
			   b[j] = '\0';
			   z = 0;
			   for (i = 0;i < sum;i++)
			   {
				 if (!b[i].equals('\0'))
				 {
				 z++;
				 }
			   }
			   if (z != 0)
			   {
				   doing(b);
			   }
				break;
		   }

	   }
		}
	  return 0;
	}
	public static int Main()
	{
		int i = 0;
		int k = 0;
		int l = 0;
		String a = new String(new char[1000]);
		a = new Scanner(System.in).nextLine();

			while (a.charAt(i) != '\0')
			{
				i++;
			}
		sum = i;
		x1 = a.charAt(0);
		i = 0;
		while (a.charAt(i) == x1)
		{
			i++;
		}
		x2 = a.charAt(i);
		//cout<<x2;
		doing(a);
		for (k = 0;k < 1000;k++)
		{
			for (l = 0;l < 1000;l++)
			{
				if (c[l][k] == 1)
				{
					System.out.print(l);
					System.out.print(" ");
					System.out.print(k);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}
