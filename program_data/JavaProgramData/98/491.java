package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int sum = 0;
		String p; //???????????
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(40);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p = tempVar2.charAt(0);
		}
		sum += p.length();
		System.out.printf("%s",p); //????????????????
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p = (String)malloc(40);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p = tempVar3.charAt(0);
			}
			sum += p.length() + 1; //????????
			if (sum < 80)
			{
				System.out.printf(" %s",p);
			}
			else
			{
				if (sum == 80)
				{
					System.out.printf(" %s\n",p); //?????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
					free(p);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
					p = (String)malloc(40); //??p?????????????????
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						p = tempVar4.charAt(0);
					}
					System.out.printf("%s",p);
					sum = p.length(); //????????????????
					i++; //??????????
				}
				else
				{
					System.out.printf("\n%s",p); //?????????????
					sum = p.length(); //??
				}
			}
		}
		System.out.print("\n");
	}
}

