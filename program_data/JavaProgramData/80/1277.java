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
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int f;
		 int x = 0;
		 int i;
		 int j;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead(" ");
		 if (tempVar2 != null)
		 {
			 b = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 c = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 d = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead(" ");
		 if (tempVar5 != null)
		 {
			 e = Integer.parseInt(tempVar5);
		 }
		 String tempVar6 = ConsoleInput.scanfRead(" ");
		 if (tempVar6 != null)
		 {
			 f = Integer.parseInt(tempVar6);
		 }
		 if (a == d)
		 {
				  if (b == e)
				  {
						   x = f - c;
				  }
				  else
				  {
					   for (i = b;i <= e;i++)
					   {
										 if (i == 4 || i == 6 || i == 9 || i == 11)
										 {
																	 if (i == b)
																	 {
																			  x = 30 - c;
																			  continue;
																	 }
																	  else
																	  {
																		  if (i == e)
																		  {
																			  x = x + f;
																			  continue;
																		  }
																	 else
																	 {
																		  x = x + 30;
																		  continue;
																	 }
																	  }
										 }
										else
										{
											if (i == 2)
											{
												   if (i == b)
												   {
															x = 28 - c;
															continue;
												   }
												   else
												   {
													   if (i == e)
													   {
															x = x + f;
															continue;
													   }
												   else
												   {
														x = x + 28;
														continue;
												   }
												   }
											}
										 else
										 {

											  if (i == b)
											  {
													   x = 31 - c;
													   continue;
											  }
											  if (i == e)
											  {
													   x = x + f;
													   continue;
											  }
											  else
											  {
												   x = x + 31;
												   continue;
											  }
										 }
										}

					   }
					  if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && (b <= 2) && (e>2))
					  {
					  x++;
					  }

				  }
		 }
		  else
		  {
			   for (j = a;j <= d;j++)
			   {
								 if (j == a)
								 {
										 for (i = b;i <= 12;i++)
										 {

										 if (i == 4 || i == 6 || i == 9 || i == 11)
										 {
																	 if (i == b)
																	 {
																			  x = 30 - c;
																			  continue;
																	 }
																	 else
																	 {
																		  x = x + 30;
																		  continue;
																	 }
										 }
										 else
										 {
											 if (i == 2)
											 {
												   if (i == b)
												   {
															x = 28 - c;
															continue;
												   }
												   else
												   {
														x = x + 28;
														continue;
												   }
											 }
										 else
										 {
											  if (i == b)
											  {
													   x = 31 - c;
													   continue;
											  }
											  else
											  {
												   x = x + 31;
												   continue;
											  }
										 }
										 }
										 }
					  if (((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) && (b <= 2))
					  {
					  x++;
					  }

								 }
					   else
					   {

							 if (j == d)
							 {

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


