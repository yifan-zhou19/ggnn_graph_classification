import java.util.*;

package <missing>;

public class GlobalMembers
{
	//
	//	?????	????
	//	?????	?????????????????????????????????????????????
	//	?????	?	? ? ? ?? 1000012733 ?
	//	?????	2010 ? 12 ? 31 ?
	//
	public static void line(tangible.RefObject<String> p, tangible.RefObject<Integer> q, int len)
	{
		int i;
		int j;
		for (i = 0; i < len; i++)
		{
			if (*(p.argValue.Substring(i)) == p.argValue)
			{
				for (j = i + 1; j < len; j++)
				{
					if (*(q.argValue + j) == 0)
					{
						continue;
					}
					else
					{
						if (*(p.argValue.Substring(j)) != *(p.argValue.Substring(i)))
						{
							System.out.print(i);
							System.out.print(" ");
							System.out.print(j);
							System.out.print("\n");
							*(q.argValue + i) = 0;
							*(q.argValue + j) = 0;
							line(p, q, len);
						}
						else
						{
							break;
						}
					}
				}
			}
		}
	}
	public static int Main()
	{
		String string = new String(new char[1000]);
		int[] sign = new int[1000];
		int len;
		int i;
		String = new Scanner(System.in).nextLine();
		len = String.length();
		for (i = 0; i < len; i++)
		{
			sign[i] = 1;
		}
	tangible.RefObject<String> tempRef_String = new tangible.RefObject<String>(String);
	tangible.RefObject<Integer> tempRef_sign = new tangible.RefObject<Integer>(sign);
		line(tempRef_String, tempRef_sign, len);
		sign = tempRef_sign.argValue;
		String = tempRef_String.argValue;
		return 0;
	}
}

