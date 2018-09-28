package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char q;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			q = tempVar2.charAt(0);
		}
		int i;
		int j;
		int k;
		int b;
		int u;
		b = 0;
		String byte_Renamed = new String(new char[256]);
		for (u = 0;u < n;u++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				byte = tempVar3;
			}
			b = Byte.length();
			 for (j = 0;j < b;j++)
			 {
				switch (byte[j])
				{
				case'T':
					 byte[j] = 'A';
					break;
				 case'A':
					byte[j] = 'T';
					break;
				case'C':
					byte[j] = 'G';
					  break;
				case'G':
					  byte[j] = 'C';
					break;
				}
			 }
			for (k = 0;k < b;k++)
			{
				 System.out.printf("%c",byte_Renamed.charAt(k));
			}
			System.out.print("\n");
		}

		return 0;
	}

}

