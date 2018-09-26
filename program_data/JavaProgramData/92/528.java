package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int temp;
		int r = 0;
		int thead;
		int ttail;
		int khead;
		int ktail;
		int[] vtj = new int[1100];
		int[] vqw = new int[1100];
		while (true)
		{
			r = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
			break;
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					vtj[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					vqw[i] = Integer.parseInt(tempVar3);
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = i;j < n;j++)
				{
					if (vqw[j] > vqw[i])
					{
						temp = vqw[i];
						vqw[i] = vqw[j];
						vqw[j] = temp;
					}
					if (vtj[j] > vtj[i])
					{
						temp = vtj[i];
						vtj[i] = vtj[j];
						vtj[j] = temp;
					}
				}
			}
			ttail = ktail = n - 1;
			thead = khead = 0;
			while (ttail >= thead)
			{
				if (vtj[ttail] > vqw[ktail])
				{
					ttail--;
					ktail--;
					r += 200;
					continue;
				}
				else if (vtj[ttail] < vqw[ktail])
				{
					r -= 200;
					ttail--;
					khead++;
					continue;
				}
				else
				{
					if (vtj[thead] > vqw[khead])
					{
						r += 200;
						thead++;
						khead++;
					}
					else if (vtj[thead] < vqw[khead])
					{
						r -= 200;
						ttail--;
						khead++;
					}
					else
					{
						if (vtj[ttail] < vqw[khead])
						{
							r -= 200;
							ttail--;
							khead++;
						}
						else
						{
							ttail--;
							khead++;
						}
					}
					continue;
				}
			}
		System.out.printf("%d\n",r);
		}
		System.in.read();
		System.in.read();
	}

}

