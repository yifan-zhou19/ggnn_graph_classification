import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[5000]);
	int i;
	int j;
	int t;
	a = new Scanner(System.in).nextLine();
	t = a.length();
	for (i = 0;i < t;i++)
	{
	if (*(a.Substring(i)) == ' ')
	{
		if (*(a.Substring(i) + 1) == ' ')
		{
			for (j = i + 1;j < t;j++)
			{
			 *(a.Substring(j)) = *(a.Substring(j) + 1);
			}
		t--;
		i--;
		}
	}
	}
	System.out.print(a);
	System.out.print("\n");
	return 0;
	}


}
