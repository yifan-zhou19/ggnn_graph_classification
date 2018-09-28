//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] y = new int[300];
		int[] m1 = new int[300];
		int[] m2 = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((y[i] % 4 == 0 && y[i] % 100 != 0) || y[i] % 400 == 0)
			{

				switch (m1[i])
				{
				case 1:
					m1[i] = 0;
					break;
					case 2:
						m1[i] = 31;
						break;
						case 3:
							m1[i] = 31 + 29;
							break;
							case 4:
								m1[i] = 31 + 29 + 31;
								break;
								case 5:
									m1[i] = 31 + 29 + 31 + 30;
									break;
									case 6:
										m1[i] = 31 + 29 + 31 + 30 + 31;
										break;
										case 7:
											m1[i] = 31 + 29 + 31 + 30 + 31 + 30;
											break;
											case 8:
												m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31;
												break;
												case 9:
													m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
													break;
													case 10:
														m1[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
														break;
														case 11:
															m1[i] = 366 - 30 - 31;
															break;
															case 12:
																m1[i] = 366 - 31;
																break;
				}
					switch (m2[i])
					{
				case 1:
					m2[i] = 0;
					break;
					case 2:
						m2[i] = 31;
						break;
						case 3:
							m2[i] = 31 + 29;
							break;
							case 4:
								m2[i] = 31 + 29 + 31;
								break;
								case 5:
									m2[i] = 31 + 29 + 31 + 30;
									break;
									case 6:
										m2[i] = 31 + 29 + 31 + 30 + 31;
										break;
										case 7:
											m2[i] = 31 + 29 + 31 + 30 + 31 + 30;
											break;
											case 8:
												m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31;
												break;
												case 9:
													m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
													break;
													case 10:
														m2[i] = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
														break;
														case 11:
															m2[i] = 366 - 30 - 31;
															break;
															case 12:
																m2[i] = 366 - 31;
																break;
					}

				if ((m2[i] - m1[i]) % 7 == 0 || (m1[i] - m2[i]) % 7 == 0)
				{
					System.out.print("YES\n");
				}
				else
				{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


