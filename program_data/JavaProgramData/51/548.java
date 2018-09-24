import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************************
	//** ???Dec 11, 2013 - n-gram???? **
	//** ?????? 1300012719             **
	//** ???2013.12.14                    **
	//*****************************************
	public static int Main()
	{
		char[][] c = new char[501][5]; //c????????n????,str???????,temp????str????n????
		String str = new String(new char[501]);
		String temp = new String(new char[5]);
		int[] freq = new int[501]; //freq??????????????,maxfreq?????,flag?????????????,cnt??????????????
		int maxfreq = 1;
		int i;
		int j;
		int n;
		int len;
		int cnt = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,'\0',2505);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str,'\0',501);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		str = new Scanner(System.in).nextLine();
		len = str.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(freq,0,501);
		for (i = 0; i <= str.length() - n; i++)
		{
			for (j = 0; j < n; j++)
			{
				*(*(c + i) + j) = *(str.Substring(i) + j);
			}
			*(*(c + i) + j) = '\0';
			freq[i] = 1;
		}
		for (i = 0; i < len - n; i++)
		{
			if (freq[i] != 0)
			{
				for (j = i + 1; j <= len - n; j++)
				{
					if (strncmp(*(c + i),*(c + j),n) == 0)
					{
						freq[i] = (freq + i) + 1;
						freq[j] = 0;
					}
				}
			}
		}
		for (i = 0; i < len - n; i++)
		{
			if (maxfreq < freq[i])
			{
				maxfreq = freq[i];
			}
		}
		if (maxfreq == 1)
		{
			System.out.print("NO");
			System.out.print("\n");
			return 0;
		}
		System.out.print(maxfreq);
		System.out.print("\n");
		for (i = 0; i < len - n; i++)
		{
			if (freq[i] == maxfreq)
			{
				System.out.print((c + i));
				System.out.print("\n");
			}
		}
		return 0;
	}
}

