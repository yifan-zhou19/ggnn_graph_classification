import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[40]);
		str = new Scanner(System.in).nextLine();
		String p;
		p = str;
		int len = str.length();
		int i;
		int j;
		for (i = 0;i <= len - 1;)
		{
					   if (*(p.Substring(i)) == '0' && (*(p.Substring(i) + 1) < '0' || *(p.Substring(i) + 1)>'9'))
					   {
					  System.out.print((p.Substring(i)));
					   i++;
					   }
			else if (*(p.Substring(i)) >= '1' && *(p.Substring(i)) <= '9')
			{
				for (j = 0; ;j++)
				{


				if (*(p.Substring(i) + j) >= '0' && *(p.Substring(i) + j) <= '9' && i + j <= len - 1)
				{
						System.out.print((p.Substring(i) + j));
				}
					else
					{
						System.out.print("\n");
						i = i + j;
						break;
					}
				}
			}
		else
		{
				  i++;
		}
		}
	   return 0;
	}





}
