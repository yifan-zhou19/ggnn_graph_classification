import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[10000]);
		int len;
		String p;
		int i;
		int n;
		int j;
		int lenq = 0;
		int lenh = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		a = new Scanner(System.in).nextLine();
		p = a;
		i = 0;
		while (*(p.Substring(i)) != ' ')
		{

			i++;
		}
		lenq = i;
		len = lenq;
		while (n-- != 0)
		{
			i = 0;
			p += lenq;
			p = p.Substring(1);
			while (*(p.Substring(i)) != ' ' && *(p.Substring(i)) != '\0')
			{
				i++;
			}
			lenh = i;
			len += lenh;
			len++;
			p -= lenq;
			p--;
			if (len <= 80)
			{
					for (j = 0;j <= lenq - 1;j++)
					{
						System.out.print((p.Substring(j)));
					}
					if (n != 0)
					{
						System.out.print(" ");
					}
			}
			else
			{
					for (j = 0;j <= lenq - 1;j++)
					{
						System.out.print((p.Substring(j)));
					}
					System.out.print("\n");
					len = lenh;
			}
			p += lenq;
			p = p.Substring(1);
			lenq = lenh;

		}



		return 0;
	}
}

