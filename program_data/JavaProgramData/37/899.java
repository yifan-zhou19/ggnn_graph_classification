public class Word
{
	public int time;
	public int sequence;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		char temp;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();

		for (i = 0; i < n; i++)
		{
			int seqs = 27;
			int yesOrNo = 0;
			Word[] word = {'\0', 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

			for (k = 0; k < 100001; k++)
			{
				temp = System.in.read();
				if (temp == 10)
				{
					break;
				}
				word[temp - 97].time++;
				word[temp - 97].sequence = k + 1;
			}

			for (k = 0; k < 26; k++)
			{
				if (word[k].time != 1)
				{
				}
				else if (word[k].time == 1)
				{
					if (seqs > word[k].sequence)
					{
						seqs = word[k].sequence;
					}
				}
			}
			for (k = 0; k < 26; k++)
			{
				if (seqs == word[k].sequence)
				{
					System.out.printf("%c\n",(char)k + 97);
					yesOrNo = 1;
					break;
				}
			}
			if (yesOrNo == 0)
			{
				System.out.print("no");
			}
		}
		return 0;
	}
}

