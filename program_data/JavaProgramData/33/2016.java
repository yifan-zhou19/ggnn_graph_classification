package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String[] dna;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		dna = (String)malloc(sizeof(String) * n);
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			dna[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 255);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				dna[i] = tempVar2.charAt(0);
			}
		}

		char ch;

		for (i = 0;i < n;i++)
		{
			for (j = 0;(ch = dna[i][j]) != 0;j++)
			{
				switch (ch)
				{
				case 'A':
					System.out.print("T");
					break;
				case 'T':
					System.out.print("A");
					break;
				case 'G':
					System.out.print("C");
					break;
				case 'C':
					System.out.print("G");
					break;
				}
			}
			System.out.print("\n");
		}

		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
			free(dna[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(dna);
		return 0;
	}
}

