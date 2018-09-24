import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	final String ch = "";
	ch = new Scanner(System.in).nextLine();
	int i;
	int j = 0;
	int len;
	len = ch.length();
	for (i = 0;i < len;i++)
	{
	while (true)
	{
	if (ch.charAt(j) == ch.charAt(i) || ch.charAt(j) - ch.charAt(i) == 32 || -ch.charAt(j) + ch.charAt(i) == 32)
	{
	j++;
	}
	else
	{
		break;
	}
	}
	System.out.print('(');
	if (ch.charAt(i) >= 'a')
	{
	System.out.print((char)(ch.charAt(i) - 32));
	}
	else
	{
	System.out.print(ch.charAt(i));
	}
	System.out.print(',');
	System.out.print(j - i);
	System.out.print(')');
	i = j - 1;
	}
	return 0;
	}
}
